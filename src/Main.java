public class Main {
        public static void main(String[] args) {

            GamePiece myGamePiece = new GamePiece();

            System.out.println("Position before move: " + myGamePiece.getPositionX() + ", " + myGamePiece.getPositionY());
            myGamePiece.move(1,2);
            System.out.println("Position after move: " + myGamePiece.getPositionX() + ", " + myGamePiece.getPositionY());



            System.out.println("Before Freeze " + myGamePiece.isFrozen());
            myGamePiece.freeze();
            if(myGamePiece.isFrozen() == true ){
                System.out.println("Success, frozen");
            } else {
                System.out.println ("failure, YOU moved");
            }

            myGamePiece.move(5, 6);
            if(myGamePiece.isFrozen() == true ){
                System.out.println("Success you have moved");
            } else {
                System.out.println("you have not moved");
            }


            System.out.println("After Freeze " + myGamePiece.isFrozen());
            myGamePiece.unfreeze();
            if(myGamePiece.isFrozen() == false ){
                System.out.println("Success, you are unfrozen");
            } else {
                System.out.println ("unsuccessful you're still frozen");
            }



        }
}
