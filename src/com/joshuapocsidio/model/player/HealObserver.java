package com.joshuapocsidio.model.player;

public interface HealObserver
{
    void showHealEvent(CombatPlayer player, int healed);
}
