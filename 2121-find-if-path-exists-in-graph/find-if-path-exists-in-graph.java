class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        HashMap<Integer , List<Integer>> graph = new HashMap<>();

        for(int [] edge : edges)
        {
            int u = edge[0] , v = edge[1];

            graph.computeIfAbsent(u , value->new  ArrayList<>()).add(v);
            graph.computeIfAbsent(v , value->new  ArrayList<>()).add(u);

        }

        boolean [] vis = new boolean[n];
        for(int i = 0 ; i<n;i++)
        {
          vis[i] = false;
        }
        vis[source] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        while(!queue.isEmpty())
        {
            int currt = queue.remove();
            if( currt == destination)
            {
                return true;
            }

            for( int neighber : graph.get(currt))
            {
                if(!vis[neighber])
                {
                    queue.add(neighber);
                    vis[neighber] = true;
                }
            }
        }
        return false;
        
        
    }
}