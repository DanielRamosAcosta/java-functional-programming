package pure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LikesIncrementPureShould {
    @Test
    void add_likes_in_deterministic_way() {
        int likes = 3;
        int newLikes = LikesIncrementPure.addLike(likes);
        assertEquals(4, newLikes);
    }
}
