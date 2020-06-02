package com.javarush.task.task36.task3604;

/* 
Разбираемся в красно-черном дереве
*/
public class Solution {
    public static void main(String[] args) {

    }

//    public void insert( Comparable item ) {
//        current = parent = grand = header;
//        nullNode.element = item;
//
//        while( compare( item, current ) != 0 ) {
//            great = grand; grand = parent; parent = current;
//            current = compare( item, current ) < 0 ?
//                    current.left : current.right;
//
//            // Check if two red children; fix if so
//            if( current.left.color == RED && current.right.color == RED )
//                handleReorient( item );
//        }
//
//        // Insertion fails if already present
//        if( current != nullNode )
//            throw new DuplicateItemException( item.toString( ) );
//        current = new RedBlackNode( item, nullNode, nullNode );
//
//        // Attach to parent
//        if( compare( item, parent ) < 0 )
//            parent.left = current;
//        else
//            parent.right = current;
//        handleReorient( item );
//    }
}
