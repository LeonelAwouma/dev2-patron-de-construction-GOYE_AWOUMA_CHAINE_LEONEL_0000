# Patron de construction — Abstract Factory

INF461 — Principes et processus du logiciel · AWOUMA Goye

## Contenu

| Dossier | Contenu |
| --- | --- |
| `src/construction/abstractfactory/cours/` | Exemple du cours : `ProduitA`, `ProduitB` × familles 1 et 2 |
| `src/construction/abstractfactory/exemple2/` | Exemple 2 du cours : scooters et automobiles, Essence / Électrique |
| `src/construction/abstractfactory/modifie/` | Exemple modifié : exemple 2 + famille Hybride |
| `diagrammes/dia/` | Diagrammes de classes (Dia) |
| `diagrammes/png/` | Images des diagrammes |

## Exécution

```bash
javac -encoding UTF-8 -d bin src/construction/*/*/*.java
java -cp bin construction.abstractfactory.cours.Client
java -cp bin construction.abstractfactory.exemple2.Client ESSENCE
java -cp bin construction.abstractfactory.modifie.Client HYBRIDE
```
