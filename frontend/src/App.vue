<template>
  <div id="app">
    <Products List/>
  </div>
</template>

<script>
import Products from './components/Products.vue'
// import ProductService from './services/ProductService';

export default {
  name: 'App',
  components: {
    Products,
}
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>