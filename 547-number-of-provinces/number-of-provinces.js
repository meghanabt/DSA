var findCircleNum = function(isConnected) {
    const visited = Array(isConnected.length).fill(false);
    
    function traverse(index) {
        visited[index] = true;
        
        for (let i = 0; i < isConnected[index].length; i++) {
            if (!visited[i] && isConnected[index][i] === 1) {
                traverse(i);
            }
        }
    }
    
    let total = 0;
    
    for (let i = 0; i < isConnected.length; i++) {
        if (!visited[i]) {
            traverse(i);
            total++;
        }
    }
    
    return total;
};