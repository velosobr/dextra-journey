/* eslint-disable semi */
import React, {Component} from 'react';
import {Text, View, FlatList, StyleSheet} from 'react-native';
import axios from 'axios';
import PokeCard from '../Components/PokeCard'

export default class Home extends Component {
  state = {
    loading: true,
    pokemons: [],
  }

  async componentDidMount() {
    let response = await axios.get('https://pokeapi.co/api/v2/pokemon/');

    this.setState({pokemons: response.data.results, loading: false});
  }

  render() {
    if (this.state.loading) {
      return (
        <View>
          <Text>loading</Text>
        </View>
      )
    } else {

      return (
       <View style={styles.container}>
          <FlatList
            data = {this.state.pokemons}
            contentContainerStyle= {styles.contentContainer}
            renderItem = {({ item }) => <PokeCard name ={item.name}/>}
            keyExtrator = {item => item.name}
          />
        </View>
      )
    }
  }
}


const styles = StyleSheet.create({
  container: {
    backgroundColor: 'red',
    flex: 1
  },
  contentContainer: {
    padding: 16
  }
})