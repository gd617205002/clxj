package com.one.clxj.util;

import com.one.clxj.pojo.Grants;
import com.one.clxj.pojo.Payformonth;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * 把excel转为java对象
 */
public class ExcelToPojo {
    //    数据
    private List<List<String>> datas;

    private ImportExcelUtil importExcelUtil;

    private File file;
    //    上传路径
    private String dir = "H://uploadexcle//";

    /**
     * 构造
     *
     * @param file
     */
    public ExcelToPojo(File file) {
        this.file = file;
        this.importExcelUtil = new ImportExcelUtil();
    }

    public ExcelToPojo(String filePath) {
        this.file = new File(filePath);
        this.importExcelUtil = new ImportExcelUtil();
    }

    public ExcelToPojo(MultipartFile file) throws IOException {

        //获取输出流
        File save = new File(dir);
        //文件不存在则创建文件
        if (!save.exists()) {
            save.mkdirs();
        }
        String fileName = dir+new Date().getTime()+".xls";
        save = new File(fileName);
        if (!save.exists()) {
            save.createNewFile();
        }
        OutputStream os = new FileOutputStream(save);
        //获取输入流 CommonsMultipartFile 中可以直接得到文件的流
        InputStream is = file.getInputStream();
        int temp;
        //一个一个字节的读取并写入
        while ((temp = is.read()) != (-1)) {
            os.write(temp);
        }
        os.flush();
        os.close();
        is.close();
        this.file = new File(fileName);
        this.importExcelUtil = new ImportExcelUtil();
    }


    //  得到月底支出对象
    public List<Payformonth> toPayformonths() throws TransitionException, DataIsNullException, FileNotFoundException {
        getDatas();
        List<Payformonth> list = new ArrayList<Payformonth>();
        //        遍历数据
        for (int i = 0; i < datas.size(); i++) {
            List<String> row = datas.get(i);
            if (row.size() != 4)
                throw new TransitionException("数据导入失败.原因:Excel表数据不符合规定-toPayformonths");
            Payformonth payformonth = null;
            try {
                payformonth = new Payformonth();
                payformonth.setMonthly(row.get(0));
                payformonth.setProjectname(row.get(1));
                payformonth.setPaymoney(new Double(row.get(2)));
                payformonth.setRemarks(row.get(3));
            } catch (Exception e) {
                throw new TransitionException("数据导入失败.原因:Excel表数据不符合规定-toPayformonths");
            }
            if (payformonth != null)
                list.add(payformonth);
        }
        return list;
    }

    //  得到物品发放对象
    public List<Grants> toGrants() throws TransitionException, DataIsNullException, FileNotFoundException {
        getDatas();
        List<Grants> list = new ArrayList<Grants>();
        //        遍历数据
        for (int i = 0; i < datas.size(); i++) {
            List<String> row = datas.get(i);
            if (row.size() != 7)
                throw new TransitionException("数据导入失败.原因:Excel表数据不符合规定-toGrants");
            Grants grants = null;
            try {
                grants = new Grants();
                grants.setDonationname(row.get(0));
                grants.setGoods(row.get(1));
                grants.setNum(new Integer(row.get(2)));
                grants.setWorthless(new Double(row.get(3)));
                grants.setUseto(row.get(4));
                grants.setRecipients(row.get(5));
                Date date = null;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                date = simpleDateFormat.parse(row.get(6));
                grants.setDonationTime(date);
            } catch (Exception e) {
                throw new TransitionException("数据导入失败.原因:Excel表数据不符合规定-toGrants");
            }
            if (grants != null)
                list.add(grants);
        }
        return list;
    }


    //    得到数据
    private void getDatas() throws DataIsNullException, FileNotFoundException {
        FileInputStream input = new FileInputStream(this.file);
        try {
            this.datas = importExcelUtil.getBankListByExcel(input, importExcelUtil.excel2003L);
        } catch (Exception e) {
            throw new DataIsNullException("数据导入失败.原因:Excel表不包含任何数据1");
        }
        if (this.datas == null || this.datas.size() <= 0)
            throw new DataIsNullException("数据导入失败.原因:Excel表不包含任何数据2");
        try {
            input.close();
        } catch (Exception e) {
            throw new DataIsNullException("数据导入失败.原因:Excel表不包含任何数据3");
        }

    }

    //
    public static void main(String[] args) {
        File file = new File("H:\\idea\\clxj\\src\\main\\java\\com\\one\\clxj\\util\\test.xls");
        ExcelToPojo excelToPojo = new ExcelToPojo(file);

        List<Payformonth> list = null;
        try {
            list = excelToPojo.toPayformonths();
            System.out.println(list);
        } catch (TransitionException e) {
            e.printStackTrace();
        } catch (DataIsNullException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file2 = new File("H:\\idea\\clxj\\src\\main\\java\\com\\one\\clxj\\util\\test2.xls");
        ExcelToPojo excelToPojo2 = new ExcelToPojo(file2);

        List<Grants> list2 = null;
        try {
            list2 = excelToPojo2.toGrants();
            System.out.println(list2);
        } catch (TransitionException e) {
            e.printStackTrace();
        } catch (DataIsNullException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}


