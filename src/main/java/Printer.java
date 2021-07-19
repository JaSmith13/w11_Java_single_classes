public class Printer {
    private int pagesLeft;
    private int tonerVolume;

    public Printer(int pagesLeft, int tonerVolume){
        this.pagesLeft = pagesLeft;
        this.tonerVolume = tonerVolume;
    }

    public int GetPagesLeft(){
        return this.pagesLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public void Print(int copies, int numOfPages){
        int totalPages = copies * numOfPages;
        if (pagesLeft >= totalPages){
            pagesLeft -= totalPages;
            tonerVolume -= totalPages;
        }
    }
}
