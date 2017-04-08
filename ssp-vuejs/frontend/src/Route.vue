<script>
import NotFound from './components/NotFound'
import Todo from './components/Todo'
import Vmodel from './components/Vmodel'
import Hello from './components/Hello'

const routes = {
  '/': Hello,
  '/todo': Todo,
  '/model': Vmodel
}

export default {
  name: 'route',
  data () {
    return {
      currentRoute: window.location.pathname
    }
  },
  computed: {
    ViewComponent () {
      return routes[this.currentRoute] || NotFound
    }
  },
  render (h) { return h(this.ViewComponent) }
}

</script>
