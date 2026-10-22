Scaffold(modifier = Modifier,
{
    TopAppBar(
        title = { Text(text = stringResource(id=R.string.tampil), color = Color.White)},
        colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id=R.color.teal_700))
    )
}){ isiRuang->
    Column(modifier = Modifier.padding(isiRuang),
        verticalArrangement = Arrangement.SpaceBetween) {

