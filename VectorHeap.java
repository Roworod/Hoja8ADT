/****************************
*@author: Robbin Woods 15201
*@version: 1.0
*1/10/2016
*Vector Heap
*****************************/

public class VectorHeap<E extends Comparable> implements PriorityQueue<E>{
	protected Vector<E> data;

	public VectorHeap(){
		data= new Vector<E>;
	}

	public getFirst(){
		return data.firstElement();
	}

	public E remove(){
		E temp = data.get(data.size);
		data.remove(temp);
		return temp;
	}

	public void add(E value){
		
	}
	public boolean isEmpty(){
		return data.isEmpty();
	}

	public int size(){
		return data.size();
	}

	public void clear(){
		data.clear();
	}
}