<template>
  <div id="app">
    <a href="/">Home</a>
    <a href="/todo">Todo</a>
    <a href="/model">Model</a>
    <br>
    <img src="./assets/logo.png">
    <route></route>
  </div>
</template>

<script>
import Route from './Route'

export default {
  name: 'app',
  components: {
    Route
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
