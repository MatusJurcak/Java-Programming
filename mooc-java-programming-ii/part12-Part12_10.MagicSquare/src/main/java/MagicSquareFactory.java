
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int i = 1;
        int y = 0;
        int x = size/2;
        while(i < size*size + 1){
            square.placeValue(x, y, i);
            int x1 = x;
            int y1 = y;
            x1++;
            y1--;
            if(y1 < 0){
                y1 = square.getHeight() - 1;
            }
            if(x1 == square.getWidth()){
                x1 = 0;
            }
            if(square.readValue(x1, y1) != 0){
                y += 1;
                if(y > square.getHeight() - 1){
                    y = 0;
                }
                i++;
                continue;
            }
            x = x1;
            y = y1;
            i++;
        }
        return square;
    }

}
