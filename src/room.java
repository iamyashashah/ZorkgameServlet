

public class room {

    public room() {
        // TODO Auto-generated constructor stub
    }
    private String name;
    private String direction1;
    private String direction2;
    private String direction3;
    private String item;
   
    public String getDirection1() {
        return direction1;
    }
    public void setDirection1(String direction1) {
        this.direction1 = direction1;
    }
    public String getDirection2() {
       
        return direction2;
    }
    public void setDirection2(String direction2) {
        this.direction2 = direction2;
    }
    public String getDirection3() {
        return direction3;
    }
    public void setDirection3(String direction3) {
        this.direction3 = direction3;
    }
   
    public String getItem() {
        return item;
    }
    public void setItem(String item1) {
        this.item = item1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        this.name = name1;
    }
   
   
    public room(String name1  ,String things1 ,String dir1 ,String dir2 ,String dir3, String item1) {
        this.name = name1;
        this.direction1 = dir1;
        this.direction2 = dir2;
        this.direction3 = dir3;
        this.item = item1;
    }
    @Override
    public String toString() {
        return "room [name=" + name + ",direction1="+ direction1 +",direction2=" + direction2 +",direction3="+ direction3 +" ,item=" + item + "]";
    }
   
   

}