package com.assignment.budgetApp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.assignment.budgetApp.components.CategoryBadge
import com.assignment.budgetApp.models.Expense
import com.assignment.budgetApp.ui.theme.LabelSecondary
import com.assignment.budgetApp.ui.theme.Typography
import java.text.DecimalFormat
import java.time.format.DateTimeFormatter

@Composable
fun ExpenseRow(expense: Expense, modifier: Modifier = Modifier) {
  Column(modifier = modifier) {
    Row(
      modifier = Modifier.fillMaxWidth(),
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      Text(
        expense.note ?: expense.category!!.name,
        style = Typography.headlineMedium
      )
      Text(
        "MYR ${DecimalFormat("0.#").format(expense.amount)}",
        style = Typography.headlineMedium
      )
    }
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(top = 6.dp),
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      CategoryBadge(category = expense.category!!)
      Text(
        expense.date.format(DateTimeFormatter.ofPattern("HH:mm")),
        style = Typography.bodyMedium,
        color = LabelSecondary
      )
    }
  }
}