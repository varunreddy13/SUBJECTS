function loopClick() {
    let sum = 0
    let product = 1
    for (let count = 1; count <= 1000; count++) {
       sum += count
       product *= count
    }
    document.getElementById('demo').innerHTML = "Sum is " + sum + " product is " + product;
}
