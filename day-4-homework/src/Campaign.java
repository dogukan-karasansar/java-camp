public class Campaign {
    private int id;
    private String name;
    private int percentOfDiscount;

    public Campaign() {
    }

    public Campaign(int id, String name, int percentOfDiscount) {
        this.id = id;
        this.name = name;
        this.percentOfDiscount = percentOfDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentOfDiscount() {
        return percentOfDiscount;
    }

    public void setPercentOfDiscount(int percentOfDiscount) {
        this.percentOfDiscount = percentOfDiscount;
    }
}
