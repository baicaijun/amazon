package com.modeush.amazon.emailregister;

import com.modeush.amazon.util.HttpClientHelp;

public class SumaApi {

    public static String getRequestToken() throws Exception{
        String token=HttpClientHelp.httpClientGet(SumaConstant.LOGIN_URL);
        int one=token.indexOf("|");
        String tokenStr=token.substring(one+1,token.length());
        return tokenStr;
    }

    public static String getPersonalInfo(String token) throws Exception{
        String url=SumaConstant.REQUEST_TOKEN_URL+"token="+token;
        return HttpClientHelp.httpClientGet(url);
    }

    public static String getPhoneNumber(String pid,String token) throws  Exception{
        String url = SumaConstant.REQUEST_PHONE_NUMBER+"token="+token+"&pid="+pid;
        String phoneNum=HttpClientHelp.httpClientGet(url);
        String phoneNumStr=phoneNum.substring(0,phoneNum.indexOf("|"));
        return phoneNumStr;
    }

    public static String getValidateCode(String phoneNum,String token) throws Exception{
        String url = SumaConstant.VAILIDATE_CODE+"&mobile="+phoneNum+"&token="+token+"&author_uid=chenyixiao";
        return HttpClientHelp.httpClientGet(url);
    }

}
