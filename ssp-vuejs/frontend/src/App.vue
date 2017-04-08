<template>
  <div id="app">
    <hello></hello>
    <vmodel></vmodel>
    <hr>
    <loop></loop>
    <!--<img src="./assets/logo.png">-->

  </div>
</template>

<script>
import Hello from './components/Hello'
import Loop from './components/Loop'
import Vmodel from './components/Vmodel'

export default {
  name: 'app',
  components: {
    Hello,
    Loop,
    Vmodel
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
