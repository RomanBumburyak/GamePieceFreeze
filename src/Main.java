public class Main {
        public static void main(String[] args) {

            GamePiece myGamePiece = new GamePiece();

            myGamePiece.move(1,1);
            System.out.println("Before Freeze" + myGamePiece.isFrozen());
            myGamePiece.freeze();
            System.out.println("After Freeze" + myGamePiece.isFrozen());
            myGamePiece.unfreeze();
            System.out.println("After unfreeze" + myGamePiece.isFrozen());

        }
}
