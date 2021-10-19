public class Letter implements Comparable<Letter> {  

private char letter;
private int position;
public Letter(char input){
  letter = input;
  
  switch (letter){
    case 'A':
    position = 1;
    break;
    case 'B':
    position = 2;
    break;
    case 'C':
    position = 3;
    break;
    case 'D':
    position = 4;
    break;
    case 'E':
    position = 5;
    break;
    case 'F':
    position = 6;
    break;
    case 'G':
    position = 7;
    break;
    case 'H':
    position = 8;
    break;
    case 'I':
    position = 9;
    break;
    case 'J':
    position = 10;
    break;
    case 'K':
    position = 11;
    break;
    case 'L':
    position = 12;
    break;
    case 'M':
    position = 13;
    break;
    case 'N':
    position = 14;
    break;
    case 'O':
    position = 15;
    break;
    case 'P':
    position = 16;
    break;
    case 'Q':
    position = 17;
    break;
    case 'R':
    position = 18;
    break;
    case 'S':
    position = 19;
    break;
    case 'T':
    position = 20;
    break;
    case 'U':
    position = 21;
    break;
    case 'V':
    position = 22;
    break;
    case 'W':
    position = 23;
    break;
    case 'X':
    position = 24;
    break;
    case 'Y':
    position = 25;
    break;
    case 'Z':
    position = 26;
    break;
  }

}

public char getLetter(){
  return letter;
}

public int getPosition(){
  return position;
}
public int compareTo(Letter l){
  if (l.position == this.position){
    return 0;
  } else if (l.position < this.position){
    return 1;
  } else {
    return -1;
  }
}

}