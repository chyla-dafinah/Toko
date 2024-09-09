public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        super(); 
        length = 300;
        rating = "PG";
        studio = "Newline Cinema";
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print() {
        super.print();
        System.out.println("Length\t\t:" + length);
        System.out.println("Rating\t\t:" + rating);
        System.out.println("Studio\t\t:" + studio);
    }
}
