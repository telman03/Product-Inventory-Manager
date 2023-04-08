<template>
  
  <div class="container">
    <h1 class="text-center"> Products List</h1>


    <table class="table table-striped mx-auto" border="solid 1px">
      <thead>
        <tr>
          <th> Product Id</th>
          <th> Product  Name</th>
          <th> Product In Stock</th>
          <th> Product Price</th>
        </tr>

      </thead>
      <tbody>
        <tr v-for="product in products" v-bind:key="product.productId">
          <td> {{ product.productId }}</td>
          <td> {{ product.productName }}</td>
          <td> {{ product.inStock }}</td>
          <td> {{ product.price }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>



<script>

import ProductService from '../services/ProductService';


export default {
  name: 'ProductList',
  data() {
    return {
      products: []
    }
  },
  methods: {
    getProducts() {
      ProductService.getProducts().then((response) => {
        this.products = response.data;
      });
    }
  },
  created() {
    this.getProducts();
  }

}
</script>


<style>
  .container {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
  }


</style>