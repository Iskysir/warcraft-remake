/*
 * Copyright (C) 2013-2019 Byron 3D Games Studio (www.b3dgs.com) Pierre-Alexandre (contact@b3dgs.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package com.b3dgs.warcraft.object.feature;

import com.b3dgs.lionengine.game.FeatureProvider;
import com.b3dgs.lionengine.game.feature.FeatureGet;
import com.b3dgs.lionengine.game.feature.FeatureInterface;
import com.b3dgs.lionengine.game.feature.FeatureModel;
import com.b3dgs.lionengine.game.feature.Transformable;
import com.b3dgs.lionengine.game.feature.attackable.Attacker;
import com.b3dgs.lionengine.game.feature.attackable.AttackerListenerVoid;

/**
 * Represents ability fight with close combat.
 */
@FeatureInterface
public class CloseCombat extends FeatureModel
{
    @FeatureGet private Attacker attacker;
    @FeatureGet private EntitySfx sfx;

    @Override
    public void prepare(FeatureProvider provider)
    {
        super.prepare(provider);

        attacker.addListener(new AttackerListenerVoid()
        {
            @Override
            public void notifyAttackEnded(int damages, Transformable target)
            {
                sfx.onAttacked();
                if (target.getFeature(EntityStats.class).applyDamages(damages))
                {
                    attacker.stopAttack();
                }
            }
        });
    }
}
