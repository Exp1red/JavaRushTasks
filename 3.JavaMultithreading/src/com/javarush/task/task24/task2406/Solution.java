package com.javarush.task.task24.task2406;

import java.math.BigDecimal;

/* 
Требования:
1. Класс Apt3Bedroom должен быть создан внутри класса Solution.
2. Класс BigHall должен быть создан внутри класса Solution.
3. Класс Apt3Bedroom должен быть публичным.
4. Класс BigHall должен быть публичным.
5. Класс Apt3Bedroom должен быть потомком класса Building.Apartments.
6. Класс BigHall должен быть потомком класса Building.Hall.
*/
public class Solution {



    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    public class Apt3Bedroom extends Building.Apartments{
        public Apt3Bedroom (Solution.Building a){
            a.super();
        }
    }

    public class BigHall extends Building.Hall {
        public BigHall(Solution.Building a ){
            a.super(new BigDecimal(0));
        }
    }
}
/*
class WithInner {
  class Inner {}
}

public class InheritInner extends WithInner.Inner {
  //! InheritInner() {} // He компилируется
  InheritInner(WithInner wi) {
    wi.super();
  }
  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
  }
}
 */
