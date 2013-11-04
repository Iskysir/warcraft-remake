/*
 * Copyright (C) 2013 Byron 3D Games Studio (www.b3dgs.com) Pierre-Alexandre (contact@b3dgs.com)
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package com.b3dgs.warcraft.entity.human;

import com.b3dgs.warcraft.entity.SetupEntity;
import com.b3dgs.warcraft.entity.UnitWorker;
import com.b3dgs.warcraft.skill.SkillType;

/**
 * Peon implementation.
 * 
 * @author Pierre-Alexandre (contact@b3dgs.com)
 */
public final class Peasant
        extends UnitWorker
{
    /**
     * Constructor.
     * 
     * @param setup The setup reference.
     */
    public Peasant(SetupEntity setup)
    {
        super(setup);
        addSkill(0, SkillType.MOVE_HUMAN, 0);
        addSkill(0, SkillType.STOP_HUMAN, 1);
        addSkill(0, SkillType.BUILDING_STANDARD_HUMAN, 2);
        addSkill(1, SkillType.BUILD_FARM_HUMAN, 0);
        addSkill(1, SkillType.BUILD_BARRACKS_HUMAN, 1);
        addSkill(1, SkillType.CANCEL_HUMAN, 2);
    }
}
