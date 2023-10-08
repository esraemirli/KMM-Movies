//
//  Home.swift
//  iosApp
//
//  Created by Esra Emirli on 8.10.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import shared


struct HomeScreen: View {
    
    @ObservedObject var state = ViewModels().getHomeViewModel().asObserveableObject()
            
    var body: some View {
        
            VStack{
                
                
                switch state.state {
                    
                case is HomeScreenStateError:
                    
                    
                    
                    Text((state.state as! HomeScreenStateError).errorMessage)
                    
                    
                    
                    
                case is HomeScreenStateSuccess:
                    
                    List{
                        
                        ForEach((state.state as! HomeScreenStateSuccess).movieList , id: \.title){ item in
                            Text(item.title)
                        }
                        
                    }.frame( maxWidth: .infinity)
                        .listStyle(PlainListStyle())
                    
                    
                    
                case is HomeScreenStateLoading:
                    
                    ProgressView()
                    
                default:
                    Text("default")
                    
                    
                    
                }
            }.onAppear(perform: {
                state.viewModel.getMovies()
            })
    }
}

struct Screen_Previews: PreviewProvider {
    static var previews: some View {
        HomeScreen()
    }
}

