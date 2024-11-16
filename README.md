# 🤖 Intelligent Agent for Repeated Prisoner’s Dilemma  

Academic Project for CE4046: Intelligent Agents (NTU)

## Overview  
This project implements an **intelligent agent** designed to play the **three-player repeated Prisoner’s Dilemma** game. The agent uses a strategic mix of **Tit-for-Tat**, **Tolerant**, and **Retaliatory** strategies to optimize its outcomes while adapting dynamically to opponents' actions.  

---

## Agent Strategy  

The agent operates based on **five key rules**, ensuring an intelligent balance between cooperation and defection.  

### Rules  

1. **Initial Cooperation**  
   - **Always cooperate** at the start of the game to encourage mutual cooperation and establish goodwill, emulating a **Nice Player** strategy.  

2. **Final Defection**  
   - **Always defect** towards the end of the game, emulating a **Nasty Player** strategy:  
     - Prevents retaliation as the game ends.  
     - Avoids losses if opponents choose to defect in the final rounds.  

3. **Retaliation**  
   - **Defect if either opponent defected in the last two rounds**, following a **Hard Tit-for-Tat** approach:  
     - Ensures harsher punishment, discouraging opponents from repeated defection.  

4. **Conditional Cooperation**  
   - **Cooperate if both opponents cooperated in the last round**, and their overall cooperation rate is **greater than 75%**:  
     - Encourages collaboration with lenient players while minimizing the risk of exploitation.  

5. **Default Defection**  
   - **Defect if none of the above conditions are met**:  
     - Safeguards the agent from being exploited by unpredictable or non-cooperative opponents.  

---

## Implementation  

### Key Features  
- **Adaptive Behavior**: The agent dynamically adjusts its strategy based on opponents' actions.  
- **Robust Design**: Ensures optimal outcomes across varied game scenarios.  
- **Mix of Strategies**: Combines **Nice**, **Nasty**, **Tit-for-Tat**, and **Tolerant** approaches for a balanced gameplay strategy.  

### Tools and Libraries  
- Python
 
---

## Results  

- The agent demonstrates effective decision-making across various game scenarios, maintaining a strong balance between cooperation and defection.  
- Adapts to opponent behavior to maximize its own score while discouraging consistent defection from others.  
