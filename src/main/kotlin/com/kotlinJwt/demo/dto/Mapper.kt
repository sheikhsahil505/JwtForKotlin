


import com.example.demo.dto.ItemDto
import com.kotlinJwt.demo.model.Item

/**
 * This file contains all mapping extension methods for DTOs.
 * In this simple example, there is only [Item] and [ItemDto].
 */
fun Item.toDto(): ItemDto {
    return ItemDto(id, name, count, note)
}
