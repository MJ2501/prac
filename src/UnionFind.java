public class UnionFind {
    public class QuickFind {
        int[] id;

        public QuickFind(int N) {
            id = new int[N];
            for (int i = 0; i < N; i++) {
                id[i] = i;
            }
        }

        public boolean connected(int p, int q) {
            return id[p] == id[q];
        }

        public void union(int p, int q) {
            int pid = id[p];
            int qid = id[q];
            for (int i = 0; i < id.length; i++) {
                if (id[i] == pid)
                    id[i] = qid;
            }
        }

    }

    public class QuickUnion {
        int[] id;

        public QuickUnion(int N) {
            id = new int[N];
            for (int i = 0; i < N; i++) {
                id[i] = i;
            }
        }

        private int root(int i) {
            // root of i is id[id[id....id[i]....]] that is i = id[i]
            while (i != id[i])
                i = id[i];
            return i;
        }

        public boolean connected(int p, int q) {
            return root(p) == root(q);
        }

        public void union(int p, int q) {
            int i = root(p);
            int j = root(q);

            id[i] = j;
        }
    }

    public class WeightedQuickUnion{
        int id[];
        int sz[];

        public WeightedQuickUnion(int N){
            for (int i = 0; i < N; i++){
                id[i] = i;
                sz[i] = 1; // this is 1 because each element is its own tree with size 1 at the start
            }
        }

        public int root(int i){
            while (i != id[i]) i = id[i];
            return i; 
        }

        public boolean connected(int p, int q){
            return root(p) == root(q);
        }

        public void union(int p, int q){
            int i = root(p);
            int j = root(q);
            // Here we compare thes size of the trees and append the smaller one to the larger tree 
            if(sz[j] > sz[i])   {id[i] = j; sz[j] += sz[i];}
            else                {id[j] = i; sz[i] += sz[j];}                
        }
        
    }

    
    public static void main(String[] args) {
        UnionFind uf = new UnionFind();
        QuickFind qf = uf.new QuickFind(10);
        QuickUnion qu = uf.new QuickUnion(10);
        // WeightedQuickUnion wqu = uf.new WeightedQuickUnion(10);

        qf.union(2, 3);
        qf.union(4,6);
        qf.union(1, 7);
        qf.union(7,3);
        qf.union(5,9);
        qf.union(0,8);
        qf.union(6,0);


        qu.union(2, 3);
        qu.union(4,6);
        qu.union(1, 7);
        qu.union(7,3);
        qu.union(5,9);
        qu.union(0,8);
        qu.union(6,0);


        System.out.print("Quick Find ");
        System.out.println(qf.connected(1, 7) + " " + qf.connected(6,2) + " " +  qf.connected(4, 8));
        System.out.print("Quick Union ");
        System.out.println(qu.connected(1, 7) + " " + qu.connected(6,2) + " " +  qu.connected(4, 8));
    }
}
