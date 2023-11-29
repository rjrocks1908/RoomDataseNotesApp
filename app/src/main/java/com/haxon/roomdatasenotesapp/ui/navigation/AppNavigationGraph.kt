package com.haxon.roomdatasenotesapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.haxon.roomdatasenotesapp.ui.screens.AddNoteScreen
import com.haxon.roomdatasenotesapp.ui.screens.NotesScreen

@Composable
fun AppNavigationGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.NOTES_SCREEN) {
        composable(Routes.NOTES_SCREEN) {
            NotesScreen({
                navController.navigate(Routes.ADD_NOTE_SCREEN)
            })
        }

        composable(Routes.ADD_NOTE_SCREEN) {
            AddNoteScreen(
                navController = navController,
            )
        }
    }
}