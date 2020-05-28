package com.github.mateusgabi.components.killDragon;

public class Application {
    public static void main(String[] args) {
        Board board = new Board();

        // le o dado que o usuário digitou
        DataProvider dataProvider = new DataProvider();
        dataProvider.insertCharacter();

        board.receiveData(dataProvider);

//        board.play()
    }
}
