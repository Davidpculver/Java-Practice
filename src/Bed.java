public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed -> Making | ");
    }

    public String getStyle(){
//        System.out.println("bed getStyle() called");
return style;
    }

    public int getPillows() {
//        System.out.println("bed getPillows() called");
        return pillows;
    }

    public int getHeight() {
//        System.out.println("bed getHeight() called");
        return height;
    }

    public int getSheets() {
//        System.out.println("bed getSheets() called");
        return sheets;
    }

    public int getQuilt() {
//        System.out.println("bed getQuilt() called");
        return quilt;
    }

}
