<template>
  <div id="model">

    <h3>Input</h3>

    <input v-model="message">
    <h4>{{ message }}</h4>

    <h3>Checkbox</h3>

    <input type="checkbox" id="checkbox" v-model="checked">
    <label for="checkbox">{{ checked }}</label>
    <input type="checkbox" id="jack" value="Jack" v-model="checkedNames">
    <label for="jack">Jack</label>
    <input type="checkbox" id="john" value="John" v-model="checkedNames">
    <label for="john">John</label>
    <input type="checkbox" id="mike" value="Mike" v-model="checkedNames">
    <label for="mike">Mike</label>
    <br>
    <span>Checked names: {{ checkedNames }}</span>

    <h3>Radio</h3>
    <input type="radio" id="one" value="One" v-model="picked">
    <label for="one">One</label>
    <br>
    <input type="radio" id="two" value="Two" v-model="picked">
    <label for="two">Two</label>
    <br>
    <span>Picked: {{ picked }}</span>


    <h3>Select</h3>
    <select v-model="selected">
      <option v-for="option in options" v-bind:value="option.value">
        {{ option.text }}
  </option>
    </select>
    <span>Selected: {{ selected }}</span>


  </div>
</template>

<script>
  export default {
    data () {
      return {
        message: '',
        checked: false,
        checkedNames: [],
        picked: null,
        selected: 'A',
        options: [
          { text: 'One', value: 'A' },
          { text: 'Two', value: 'B' },
          { text: 'Three', value: 'C' }
        ]
      }
    }
  }
</script>

<style>

</style>
