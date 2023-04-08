# My Vue.js and Spring Boot Application
This is a sample application that demonstrates how to build a simple web application using Vue.js and Spring Boot. The application displays a list of products retrieved from a Spring Boot backend and renders them in a table using Vue.js.

## Screenshot of Product List:
<img width="1322" alt="Screenshot 2023-04-08 at 22 12 27" src="https://user-images.githubusercontent.com/70106877/230737373-f16d789f-2342-4772-86c5-a7837e1635a3.png">

## Technologies Used
The following technologies were used in the development of this application:

- Vue.js
- Spring Boot
- Java
- JavaScript
- HTML&CSS

## Getting Started
To run the application, follow these steps:

1. Clone the repository to your local machine.
2. Open the backend project in your favorite Java IDE (e.g. IntelliJ IDEA).
3. Build and run the Spring Boot application.
4. Open the frontend project in a terminal.
5. Install the necessary dependencies by running `npm install`.
6. Start the Vue.js development server by running `npm run serve`.
7. Navigate to http://localhost:8080 in your web browser to view the application.

## Usage
The application displays a list of products retrieved from a Spring Boot backend and renders them in a table using Vue.js. You can view the list of products by navigating to http://localhost:8080 in your web browser.

Here's an example of the Vue.js component that renders the product table:

```javascript
<template>
  <div class="product-list">
    <h1>Product List</h1>
    <table>
      <thead>
        <tr>
          <th>Product ID</th>
          <th>Product Name</th>
          <th>In Stock</th>
          <th>Price</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="product in products" :key="product.productId">
          <td>{{ product.productId }}</td>
          <td>{{ product.productName }}</td>
          <td>{{ product.inStock }}</td>
          <td>{{ product.price }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      products: [],
    };
  },
  mounted() {
    this.loadProducts();
  },
  methods: {
    async loadProducts() {
      const response = await fetch('/api/products');
      const products = await response.json();
      this.products = products;
    },
  },
};
</script>

```
<img width="1507" alt="Screenshot 2023-04-08 at 22 13 35" src="https://user-images.githubusercontent.com/70106877/230737574-c336a9c1-06d1-4793-b88f-839f86991ca5.png">

## License
This project is licensed under the MIT License - see the `LICENSE` file for details.


