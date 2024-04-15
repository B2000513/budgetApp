package com.assignment.budgetApp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.assignment.budgetApp.ui.theme.BudgetAppTheme
import com.assignment.budgetApp.ui.theme.Shapes
import com.assignment.budgetApp.ui.theme.Typography
import com.assignment.budgetApp.models.User

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onLoginSuccess: (String) -> Unit,
    onNavigateToRegister: () -> Unit
) {
    var username by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Login") },
            )
        },
        content = { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Username") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text ="Password") },
                    modifier = Modifier.fillMaxWidth(),
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {
                    // Login logic here (using Realm and secure password hashing)
                    onLoginSuccess(username)  // Trigger login success callback
                }) {
                    Text(text = "Login")
                }
                Text(
                    text = "Don't have an account? Register Here",
                    modifier = Modifier
                        .clickable { onNavigateToRegister() }
                        .padding(top = 16.dp)
                )
            }
        }
    )
}
