package com.xiejun.dsaa;

import com.xiejun.dsaa.c7.Sort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        MyArrayList<Integer> lst = new MyArrayList<>( );
//
//        for( int i = 0; i < 10; i++ )
//                lst.add( i );
//        for( int i = 20; i < 30; i++ )
//                lst.add( 0, i );
//
//        lst.remove( 0 );
//        lst.remove( lst.size( ) - 1 );
//
//        System.out.println( lst );
        
//        MyLinkedList<Integer> lst = new MyLinkedList<>( );
//
//        for( int i = 0; i < 10; i++ )
//                lst.add( i );
//        for( int i = 20; i < 30; i++ )
//                lst.add( 0, i );
//
//        lst.remove( 0 );
//        lst.remove( lst.size( ) - 1 );
//
//        System.out.println( lst );
//
//        java.util.Iterator<Integer> itr = lst.iterator( );
//        while( itr.hasNext( ) )
//        {
//                itr.next( );
//                itr.remove( );
//                System.out.println( lst );
//        }
		Integer[] a = new Integer[]{3,4,9,8,1,0,2};
		Sort.heapsort(a);
	}

}
