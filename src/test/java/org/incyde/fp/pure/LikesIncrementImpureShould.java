package org.incyde.fp.pure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LikesIncrementImpureShould {
    @Test
    void add_likes_in_non_deterministic_way() {
        int newLikes = LikesIncrementImpure.addLike();
        assertEquals(4, newLikes);
    }
}
