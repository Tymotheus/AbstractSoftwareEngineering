# Project
As a project we are supposed to describe our own Metalanguage in a domain chosen by us.
It can be anything: from actual programming language as Python, through a Domain Specific Language (DSL) to something "unusual" like defininig your metalanguage of cooking.
As a whole project, we in fact have 3 sub-assignments to do:
- Build a metamodel
- Build its concrete syntax with Xtext
- Generate an external artifacts (i.e. Menu, Handlers, Xtend generator)

I started by choosing my domain.
I had couple of ideas:
- building metamodel of Python
- metamodel of Russian
- metamodel of video games (like Civilization, Stronghold: Crusader or Dune: Spice Wars)
- metamodel of a board game

## My contribution towards the project
I finally decided on the last approach. I chose "Dominion" as I think that this game is both complex enough, and simple in its rules which makes it good to model.

My plan for now is to define a Metamodel of **Dominion Game** and a Metamodel allowing to model **Player's complete game strategy** (I already have 2 simple in my mind).
I assume I can quite easily verify my strategies using online version of the game: https://dominion.games/

After that, when I generate metamodel i will create a concrete textual syntax with Xtext.

It will allow to describe a game strategy, using easy to use and understand for non-tech people language/notation.
(.dominion files)

Ideally, this will later allow to compile (translate) given .dominion files into python scripts (.py) allowing for their execution and simulation. Such a python file can be considered desired "external artifact"

## Developer diary
Strategy should look like this:
For now should depend only on your hand and money

List of assertions with actions:
Action Phase: [might be empty]
1. Market in hand => play Market
2. Mine in hand and copper in hand => play Mine (on copper?)
Buy Phase:
1. Purse >= 8 => buy Province
2. Purse >= 3 => buy Silver

Nice thing would be: if you can not execute an action - pass
How to implement triggers (can not draw cards if pile == 0) without getting lost?
And without making it cluttered?