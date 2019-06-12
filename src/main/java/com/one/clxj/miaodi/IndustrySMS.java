package com.one.clxj.miaodi;

import java.net.URLEncoder;


/**
 * 验证码通知短信接口
 *
 * @ClassName: IndustrySMS
 * @Description: 验证码通知短信接口
 *
 */
public class IndustrySMS
{
    private static String operation = "/industrySMS/sendSMS";

    private static String accountSid = Config.ACCOUNT_SID;
    private static String to = ""; //手机号
    private static String yzm = ""; //验证码
    private static String templateid = ""; //模板号
   // private static String smsContent = "尊敬的用户，您的验证码为{147258}";

    /**
     * 验证码通知短信
     */
    public static void execute(String too, String yzmm,int num) throws Exception{

        to = too;  //手机号
        yzm = yzmm; //验证码
        if (num==1){
            templateid = "1703974025"; //登录模板
        }else if(num==2){
            templateid = "1704641771"; //注册模板
        }else {
            templateid = "1705601068"; //找回模板
        }
        /*String tmpSmsContent = null;
        try{
            tmpSmsContent = URLEncoder.encode(smsContent, "UTF-8");
        }catch(Exception e){

        }*/
        String url = Config.BASE_URL + operation;
        String body = "accountSid=" + accountSid + "&to=" + to + "&templateid="+templateid+"&param="+yzm
                + HttpUtil.createCommonParam();

        // 提交请求
        String result = HttpUtil.post(url, body);
        System.out.println("result:" + System.lineSeparator() + result);
        if (result.indexOf("\"respCode\":\"00000\"")<0){
            throw new Exception("发送失败");
        }
    }
}
