class Node{
	// node adalah represetasi router
	int key;

	public Node(int key)	{
		this.key = key;
	}
}

class Graph{
	int jmlNode;    // mengetahui berapa jumlah node/vertex yang tersedia
	Node [] vertex; // untuk menyimpan data dari vertex yang ada
	int [][] adjM;  // untuk menyimpan hubungan antara satu vertex dengan vertex yang lain


	public Graph(int jmlNode){
		this.jmlNode = jmlNode;

		vertex = new Node[jmlNode];
		adjM = new int[jmlNode][jmlNode];
	}

	public void initVertexData(){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < jmlNode; i++){
			vertex[i] = new Node(input.newInt());
		}
	}

	public void addEdge(int v1, int v2){
		adjM[v1-1][v2-1] = 1;
		// tambahan untuk graph undirected
		adjM[v2-1][v1-1] = 1;
	}

	public void addEdge(int v1, int v2, int weight){
		adjM[v1-1][v2-1] = weight;
		// tambahan untuk graph undirected
		adjM[v2-1][v1-1] = weight;
	}

}

class Driver {
	public static void main(String args[]){

		Graph g = new Graph(5);

		g.addEdge(1, 2, 4);
		g.addEdge(1, 3, 10);
		g.addEdge(1, 4, 2);
		g.addEdge(2, 3, 9);
		g.addEdge(2, 4, 5);
		g.addEdge(3, 4, 14);
	}
}