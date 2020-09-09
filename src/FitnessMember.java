public class FitnessMember extends Person{
    String memberType;

    public FitnessMember(String name, String cpr, String memberType) {
        super(name, cpr);
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public String getMemberType() {
        return memberType;
    }

    public int getFee(){
        if(memberType.equals("Basic")){
            return 199;
        }
        return 299;
    }
}
