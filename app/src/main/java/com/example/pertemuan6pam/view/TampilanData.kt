Column(modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
verticalArrangement = Arrangement.spacedBy (dimensionResource(id=R.dimen.padding_small))) {
    items.forEach { item ->
        Column {
            Text(text = item.first.uppercase(), fontSize = 16.sp)
            Text(text = item.second, fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive, fontSize = 22.sp)
        }
        HorizontalDivider(thickness = 1.dp, color = Color.Cyan)
    }

   