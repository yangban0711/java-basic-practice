package OOP.ExceptionHandle.Throws;

public class LoginUser {
    private String account;
    private String password;


    public static final boolean SUCCESS = true;
    public static final boolean LOGIN_FAIL =false;

    //로그인 검증

    public boolean loginValidate(String inputAccount, String inputPassword){

        //아이디 검사
        if (inputAccount.equals(this.account)){
            if (inputPassword.equals(this.password)){
                return SUCCESS;
            }
            return LOGIN_FAIL;
        }
        return LOGIN_FAIL;

        //비밀번호 검사


    }
}
