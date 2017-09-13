public class GamePiece {
    private int positionX;
    private int positionY;
    private boolean frozen;
    private String color;
    private String name;


    //////////////////////////Constructor

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }


    //////////////////////////Constructor

    public GamePiece(String color, String name) {
        this.color = color;
        this.name = name;
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public void move(int newX, int newY) {
        if (!this.isFrozen()) {
            this.positionX = newX;
            this.positionY = newY;
            System.out.println("Moved the piece");
        }
    }

    public void freeze() {
        if (!this.isFrozen()) {
            this.frozen = true;
        }

        System.out.println("Frozen, can't move the piece");
    }

        public void unfreeze() {
        if  (this.isFrozen()){
            this.frozen = false;
        }
            System.out.println("Unfrozen, you can move the piece");
        };



    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }








    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}


///////////////////////////////////////////