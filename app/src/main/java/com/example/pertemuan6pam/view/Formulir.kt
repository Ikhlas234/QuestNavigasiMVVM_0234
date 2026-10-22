Row{
    jenisK.forEach {
            item->
        Row(verticalAlignment = Alignment.CenterVertically){
            RadioButton(
                selected = false,
                onClick = {item}
            )
            Text(text = item)
        }
    }
}

