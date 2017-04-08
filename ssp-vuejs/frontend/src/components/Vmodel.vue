<template>
  <div id="model">
    <h1>{{ message }}</h1>
    <input v-model="message">
  </div>
</template>

<script>
  export default {
    data () {
      return {
        message: ''
      }
    }
  }
</script>

<style>

</style>
