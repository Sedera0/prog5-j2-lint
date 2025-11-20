Julkwel

- Boite pour stage
CTECH
Bocasay
Igy
My Agency
Relia

- Contrat consultant
Noviity
Aztek


**CLEAN CODE**

## Principes essentiels
- Noms clairs et explicites (variables, fonctions, classes).
- Fonctions courtes et expressives (une seule responsabilité).
- Garder le code simple (KISS) et éviter l’optimisation prématurée.
- Éviter la duplication (DRY).
- Tests automatisés pour couvrir comportement critique.
- Refactorer régulièrement pour améliorer lisibilité.
- Gestion explicite des erreurs et conditions limites.
- Style et conventions cohérentes (formatage, linting).
- Préférer le code lisible aux commentaires ; quand nécessaire, commenter le "pourquoi", pas le "quoi".
- Respecter SOLID quand applicable.

## Checklist rapide pour les revues de code
- Les noms expliquent-ils l’intention ?
- Les fonctions font-elles une seule chose ?
- Y a‑t‑il des duplications à éliminer ?
- Les tests couvrent-ils les cas importants ?
- Le code est-il lisible sans commentaires excessifs ?
- Les comportements d’erreur sont-ils clairs et testés ?
- Les dépendances sont-elles injectées / découplées ?
- Le commit contient-il un message clair et descriptif ?

## Bonnes pratiques concrètes
- Préférer des types explicites et des signatures courtes.
- Limiter la portée des variables (variables locales plutôt que globales).
- Regrouper la logique liée ensemble et séparer les préoccupations (SRP).
- Utiliser des abstractions simples (interfaces/contrats) pour faciliter les tests.
- Automatiser le formatage (Prettier/clang-format) et le linting (ESLint, pylint, etc.).

## PEP / PSR — standards par langage

- PEP (Python)
  - PEP 8 : guide de style le plus utilisé (indentation, noms, longueur de ligne).
  - PEP 20 : "The Zen of Python" (philosophie).
  - Autres PEP : conventions d’API, d’optimisation ou d’évolution du langage.
  - Outils recommandés : black/ruff/isort/flake8 pour automatiser le formatage et la qualité.

- PSR (PHP)
  - PSR-1 : standard de base (noms, encodage).
  - PSR-4 : autoloading (standard d’organisation des namespaces et fichiers).
  - PSR-12 : standard de style moderne (remplace PSR-2).
  - PSR HTTP / PSR Logger : interfaces standardisées pour interopérabilité.
  - Outils recommandés : phpcs/php-cs-fixer/composer pour appliquer les règles.

- Java
  - Guides & conventions
    - Google Java Style / Oracle Code Conventions / Effective Java (livre).
    - Favor readability, immutabilité quand possible, et petites classes/méthodes.
  - Formatage & outils
    - google-java-format, Eclipse/IntelliJ formatter.
    - Checkstyle, PMD, SpotBugs pour règles statiques.
  - Build & packaging
    - Maven ou Gradle (conventions de structure, lifecycle).
    - Respecter semver pour les librairies, gérer dépendances via BOM si besoin.
  - Architecture & modules
    - Organiser package-by-feature plutôt que package-by-layer quand pertinent.
    - JPMS (modules Java) optionnel pour projets larges.
  - Tests & qualité
    - JUnit 5, Mockito, Testcontainers pour intégration, JaCoCo pour coverage.
    - Intégrer checks dans CI (build, tests, static analysis).
  - Bonnes pratiques API
    - OpenAPI pour REST, contrats clairs, gestion d’erreurs standardisée.
    - Logging via SLF4J + Logback, ne pas log sensitive data.
  - Recommandation
    - Documenter la configuration de formatteur/linter dans le repo et l’exécuter automatiquement (pre-commit / CI).

- JavaScript / TypeScript
  - Guides & conventions
    - AirBnB, Google JS, ou StandardJS : choisir un guide unique.
    - Pour TS : suivre le TypeScript Handbook et privilégier strict:true dans tsconfig.json.
  - Formatage & linting
    - Prettier pour formatage + ESLint (avec @typescript-eslint pour TS).
    - eslint-config-prettier pour éviter conflits ESLint/Prettier.
    - TSLint est obsolète — migrer vers ESLint.
  - Module & packaging
    - Utiliser ES Modules (import/export) quand possible.
    - package.json bien renseigné (engines, scripts), lockfile (package-lock.json/yarn.lock/pnpm-lock).
  - Tooling & workflow
    - Husky + lint-staged pour appliquer eslint --fix / prettier sur les commits.
    - CI : npm/yarn install, build, lint, test.
    - Security : npm audit / Snyk, dépendances figées et revues régulières.
  - Types & sécurité de typage (TypeScript)
    - Eviter any, activer strict rules, définir types/interfaces clairs.
    - Utiliser types pour API boundaries, tests typés.
  - Tests
    - Unitaires : Jest (ou Mocha), mocks contrôlés.
    - E2E : Cypress ou Playwright pour front-end.
  - Recommandation
    - Centraliser règles ESLint/Prettier, automatiser via CI, documenter exceptions dans CONTRIBUTING.md.
