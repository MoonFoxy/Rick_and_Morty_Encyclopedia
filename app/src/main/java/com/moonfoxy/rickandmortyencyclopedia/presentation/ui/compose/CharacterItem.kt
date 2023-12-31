package com.moonfoxy.rickandmortyencyclopedia.presentation.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moonfoxy.rickandmortyencyclopedia.data.models.Character
import com.moonfoxy.rickandmortyencyclopedia.data.models.CharacterLocation
import com.moonfoxy.rickandmortyencyclopedia.data.models.CharacterOrigin

class CharacterProvider : PreviewParameterProvider<Character> {
    override val values = sequenceOf(
        Character(
            id = 1,
            name = "Rick Sanchez",
            status = "Alive",
            species = "Human",
            type = "",
            gender = "Male",
            origin = CharacterOrigin("", ""),
            location = CharacterLocation("", ""),
            image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
            episode = emptyList(),
            url = "",
            created = ""
        )
    )
}

@Preview
@Composable
fun CharacterItem(
    @PreviewParameter(CharacterProvider::class) character: Character,
    onItemClick: (Character) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .clickable { onItemClick(character) }
            .padding(vertical = 16.dp, horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        CoilImage(imageUrl = character.image)

        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = character.name,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = character.species,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}