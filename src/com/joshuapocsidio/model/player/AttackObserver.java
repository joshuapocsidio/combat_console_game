package com.joshuapocsidio.model.player;

public interface AttackObserver
{
    void showAttackEvent(CombatPlayer player, int damage);
}
