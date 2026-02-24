# Changelog

## 0.1.0-alpha.32 (2026-02-24)

Full Changelog: [v0.1.0-alpha.31...v0.1.0-alpha.32](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.31...v0.1.0-alpha.32)

### Features

* **api:** api update ([c79807b](https://github.com/brand-dot-dev/java-sdk/commit/c79807b3193b735f868d6ca667eb149a054a5ad6))

## 0.1.0-alpha.31 (2026-02-23)

Full Changelog: [v0.1.0-alpha.30...v0.1.0-alpha.31](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.30...v0.1.0-alpha.31)

### Features

* **api:** manual updates ([18be8f5](https://github.com/brand-dot-dev/java-sdk/commit/18be8f5ca8d7c94220db6bca788537116da14505))

## 0.1.0-alpha.30 (2026-02-22)

Full Changelog: [v0.1.0-alpha.29...v0.1.0-alpha.30](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.29...v0.1.0-alpha.30)

### Features

* **api:** api update ([e09f05c](https://github.com/brand-dot-dev/java-sdk/commit/e09f05c64e70af02954b142ea11b42983a7758d1))
* **api:** api update ([176daa6](https://github.com/brand-dot-dev/java-sdk/commit/176daa6ade5920957e1afb073ab0f14b2dc93705))
* **api:** manual updates ([8588622](https://github.com/brand-dot-dev/java-sdk/commit/8588622a8b75ea541a9be7fc2a47a4ddd1554416))
* **client:** add connection pooling option ([50588f3](https://github.com/brand-dot-dev/java-sdk/commit/50588f3d193a48d8e764c93e72f579649f189558))
* **client:** add more convenience service method overloads ([63d98a3](https://github.com/brand-dot-dev/java-sdk/commit/63d98a3572690648e96e2a16a8bc06874887cdcf))


### Chores

* **internal:** make `OkHttp` constructor internal ([7176a5a](https://github.com/brand-dot-dev/java-sdk/commit/7176a5a3d63596c1f550864a28e4aedc1f751976))
* **internal:** remove mock server code ([34d975a](https://github.com/brand-dot-dev/java-sdk/commit/34d975a09009a15f51c843d4c4f3e3ad8822109a))
* **internal:** update `TestServerExtension` comment ([8ec7bbb](https://github.com/brand-dot-dev/java-sdk/commit/8ec7bbbdf6d8c8a3e62817f69120817f85a89f9f))
* update mock server docs ([e7cf423](https://github.com/brand-dot-dev/java-sdk/commit/e7cf4232d2397f736fce8b3dbecc80bfde182144))

## 0.1.0-alpha.29 (2026-02-07)

Full Changelog: [v0.1.0-alpha.28...v0.1.0-alpha.29](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.28...v0.1.0-alpha.29)

### Features

* **api:** api update ([dd15661](https://github.com/brand-dot-dev/java-sdk/commit/dd15661ea9caa7439136a3ad116a48cd16865531))

## 0.1.0-alpha.28 (2026-02-07)

Full Changelog: [v0.1.0-alpha.27...v0.1.0-alpha.28](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.27...v0.1.0-alpha.28)

### Features

* **api:** api update ([e826166](https://github.com/brand-dot-dev/java-sdk/commit/e826166942dc6320cfdce18d760785d60eb83bb0))


### Chores

* **internal:** upgrade AssertJ ([2656e0a](https://github.com/brand-dot-dev/java-sdk/commit/2656e0ae35284ad0f03187f0d58134162ab81a01))

## 0.1.0-alpha.27 (2026-02-02)

Full Changelog: [v0.1.0-alpha.26...v0.1.0-alpha.27](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.26...v0.1.0-alpha.27)

### Features

* **api:** api update ([fed044d](https://github.com/brand-dot-dev/java-sdk/commit/fed044d09175f814f8e0bad4df5f9555f6410e15))
* **client:** add `HttpRequest#url()` method ([6cfde89](https://github.com/brand-dot-dev/java-sdk/commit/6cfde8967d8054950cf7bfb62c3b5e9022f79107))
* **client:** allow configuring dispatcher executor service ([7eca573](https://github.com/brand-dot-dev/java-sdk/commit/7eca57352b72de96b78b7ee16be87ea844a10f89))
* **client:** send `X-Stainless-Kotlin-Version` header ([a67a402](https://github.com/brand-dot-dev/java-sdk/commit/a67a40257d88d3d34379b2f704d50958292b04e3))


### Bug Fixes

* **client:** disallow coercion from float to int ([f59913f](https://github.com/brand-dot-dev/java-sdk/commit/f59913f9452f71603dac23c42101f5f32696fe06))
* **client:** fully respect max retries ([a0aa790](https://github.com/brand-dot-dev/java-sdk/commit/a0aa7903dfc548c4dd25ef4985e80937646539de))
* **client:** preserve time zone in lenient date-time parsing ([615ebc2](https://github.com/brand-dot-dev/java-sdk/commit/615ebc293f66bbdd2ce451b0620a5cd37728212f))
* **client:** send retry count header for max retries 0 ([a0aa790](https://github.com/brand-dot-dev/java-sdk/commit/a0aa7903dfc548c4dd25ef4985e80937646539de))
* date time deserialization leniency ([0c299fe](https://github.com/brand-dot-dev/java-sdk/commit/0c299fefeefcbec581ad9c341d0a587eae6d2977))
* **docs:** fix mcp installation instructions for remote servers ([0241743](https://github.com/brand-dot-dev/java-sdk/commit/02417434d1b53a5458346be5e14512bf5dcf092f))


### Chores

* **ci:** upgrade `actions/github-script` ([b05460b](https://github.com/brand-dot-dev/java-sdk/commit/b05460be067f2336ff4c1aebbd5a29c2b9cdd8db))
* **ci:** upgrade `actions/setup-java` ([376fbbd](https://github.com/brand-dot-dev/java-sdk/commit/376fbbd3410d63bd7306bba1ccde2d264fa0cd3b))
* **internal:** allow passing args to `./scripts/test` ([e27c90d](https://github.com/brand-dot-dev/java-sdk/commit/e27c90dd180ba3a7cea0e0082f484138f07175a1))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([4718679](https://github.com/brand-dot-dev/java-sdk/commit/47186793b72b219c12faa54c3e3b54197880ff5a))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([0b13154](https://github.com/brand-dot-dev/java-sdk/commit/0b13154ffa5b630ca445371d68b676bc5eadcea3))
* **internal:** depend on packages directly in example ([a0aa790](https://github.com/brand-dot-dev/java-sdk/commit/a0aa7903dfc548c4dd25ef4985e80937646539de))
* **internal:** improve maven repo docs ([0e378d5](https://github.com/brand-dot-dev/java-sdk/commit/0e378d5bf0f3016be36b8ca0189d1ee9614bbd1b))
* **internal:** support uploading Maven repo artifacts to stainless package server ([95ab800](https://github.com/brand-dot-dev/java-sdk/commit/95ab800f7fd4ce873d638764f1c86ab6d1d427c1))
* **internal:** update `actions/checkout` version ([fec5d3a](https://github.com/brand-dot-dev/java-sdk/commit/fec5d3a47682efc4f92c4b9890de7fbf6588b906))
* **internal:** update maven repo doc to include authentication ([b1ed94c](https://github.com/brand-dot-dev/java-sdk/commit/b1ed94ce0d3afefc3597f5978bafa9adecc0ff20))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/brand-dot-dev/java-sdk/issues/3240) in tests ([0c299fe](https://github.com/brand-dot-dev/java-sdk/commit/0c299fefeefcbec581ad9c341d0a587eae6d2977))


### Documentation

* prominently feature MCP server setup in root SDK readmes ([18a0348](https://github.com/brand-dot-dev/java-sdk/commit/18a03480949d4afc6d8ed4a45a55c84094aadae6))

## 0.1.0-alpha.26 (2026-01-05)

Full Changelog: [v0.1.0-alpha.25...v0.1.0-alpha.26](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.25...v0.1.0-alpha.26)

### Features

* **api:** api update ([6e0e1d4](https://github.com/brand-dot-dev/java-sdk/commit/6e0e1d4fa0db226f953467c4ab83ee8f46203609))
* **api:** api update ([210aa14](https://github.com/brand-dot-dev/java-sdk/commit/210aa1435c09e44ab9b035f518b40bdb759936c4))
* **api:** manual updates ([10c16f9](https://github.com/brand-dot-dev/java-sdk/commit/10c16f9eeea050339c40987512567f1f36842c6f))

## 0.1.0-alpha.25 (2025-12-22)

Full Changelog: [v0.1.0-alpha.24...v0.1.0-alpha.25](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.24...v0.1.0-alpha.25)

### Features

* **api:** manual updates ([8eaeeeb](https://github.com/brand-dot-dev/java-sdk/commit/8eaeeeb4445ef396447df44707b8e3cc50646ca9))

## 0.1.0-alpha.24 (2025-12-14)

Full Changelog: [v0.1.0-alpha.23...v0.1.0-alpha.24](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.23...v0.1.0-alpha.24)

### Features

* **api:** api update ([ce9a077](https://github.com/brand-dot-dev/java-sdk/commit/ce9a077f3dde7e58698bc11bc43eb1b570718b60))

## 0.1.0-alpha.23 (2025-12-11)

Full Changelog: [v0.1.0-alpha.22...v0.1.0-alpha.23](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.22...v0.1.0-alpha.23)

### Features

* **api:** api update ([046e40d](https://github.com/brand-dot-dev/java-sdk/commit/046e40dcfdb9b4d4f0f7da34ee8bd6b0a85d39ff))


### Documentation

* remove `$` for better copy-pasteabality ([60ed63d](https://github.com/brand-dot-dev/java-sdk/commit/60ed63dc1f7defbe52e659b7584d5e5e39fa6183))

## 0.1.0-alpha.22 (2025-12-01)

Full Changelog: [v0.1.0-alpha.21...v0.1.0-alpha.22](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.21...v0.1.0-alpha.22)

### Features

* **api:** api update ([ecc7e1d](https://github.com/brand-dot-dev/java-sdk/commit/ecc7e1df87f43a72826099f26240303a708bacad))

## 0.1.0-alpha.21 (2025-11-29)

Full Changelog: [v0.1.0-alpha.20...v0.1.0-alpha.21](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.20...v0.1.0-alpha.21)

### Features

* **api:** api update ([9bad26d](https://github.com/brand-dot-dev/java-sdk/commit/9bad26d65fb93869378c3232c8b150a27dbcefad))
* **api:** manual updates ([b1fa758](https://github.com/brand-dot-dev/java-sdk/commit/b1fa7588dfa34da8ceb683ae9f917a1418a1b9ac))


### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([107ac59](https://github.com/brand-dot-dev/java-sdk/commit/107ac59dfd51ae137eab042acbeae536acdc0525))

## 0.1.0-alpha.20 (2025-11-24)

Full Changelog: [v0.1.0-alpha.19...v0.1.0-alpha.20](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.19...v0.1.0-alpha.20)

### Features

* **api:** api update ([467854b](https://github.com/brand-dot-dev/java-sdk/commit/467854b71ee6cdbefb6d9a99c4fcf7c2e029d201))

## 0.1.0-alpha.19 (2025-11-19)

Full Changelog: [v0.1.0-alpha.18...v0.1.0-alpha.19](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.18...v0.1.0-alpha.19)

### Features

* **api:** manual updates ([da5077e](https://github.com/brand-dot-dev/java-sdk/commit/da5077e0784c0e0e91775bc150371d8666a4d6cc))


### Bug Fixes

* **client:** multi-value header serialization ([6633a4b](https://github.com/brand-dot-dev/java-sdk/commit/6633a4bb4962afabe2db4a7e968561fcd3495635))

## 0.1.0-alpha.18 (2025-10-31)

Full Changelog: [v0.1.0-alpha.17...v0.1.0-alpha.18](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.17...v0.1.0-alpha.18)

### Features

* **api:** manual updates ([4457588](https://github.com/brand-dot-dev/java-sdk/commit/44575888d0fcc605a0097db9618c0b1fb1669c4f))

## 0.1.0-alpha.17 (2025-10-30)

Full Changelog: [v0.1.0-alpha.16...v0.1.0-alpha.17](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.16...v0.1.0-alpha.17)

### Features

* **api:** api update ([39b793c](https://github.com/brand-dot-dev/java-sdk/commit/39b793ccb7521dad3120a2e5bfef71492cf984a0))
* **api:** api update ([111d4ec](https://github.com/brand-dot-dev/java-sdk/commit/111d4ec6c0d203bbb6777e20e49ce1807aa57e35))
* **api:** manual updates ([cabff0c](https://github.com/brand-dot-dev/java-sdk/commit/cabff0c6d0df85a304f196860d7dd55ebcc6a796))

## 0.1.0-alpha.16 (2025-10-08)

Full Changelog: [v0.1.0-alpha.15...v0.1.0-alpha.16](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.15...v0.1.0-alpha.16)

### Features

* **api:** api update ([ae21832](https://github.com/brand-dot-dev/java-sdk/commit/ae218328d7fe9246743468d7ae71f2d8d4ebfe1a))
* **api:** api update ([42cdd94](https://github.com/brand-dot-dev/java-sdk/commit/42cdd945f8d6f4b08770a72e30bd2b4c69e1f14f))
* **api:** api update ([8e57413](https://github.com/brand-dot-dev/java-sdk/commit/8e57413b42b84e42b29f185eb9ef453896e34930))

## 0.1.0-alpha.15 (2025-09-26)

Full Changelog: [v0.1.0-alpha.14...v0.1.0-alpha.15](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.14...v0.1.0-alpha.15)

### Features

* **api:** api update ([aac4e9e](https://github.com/brand-dot-dev/java-sdk/commit/aac4e9e863a225e8d0ea9bac88addbf8fc588894))
* **client:** expose sleeper option ([ae2f570](https://github.com/brand-dot-dev/java-sdk/commit/ae2f570de5403c9e4387c3a19474de25e0389d64))


### Bug Fixes

* **client:** deserialization of empty objects ([fac2a8c](https://github.com/brand-dot-dev/java-sdk/commit/fac2a8c36227803782d90709dda826adc638bfa0))
* **client:** ensure single timer is created per client ([ae2f570](https://github.com/brand-dot-dev/java-sdk/commit/ae2f570de5403c9e4387c3a19474de25e0389d64))
* **client:** incorrect `getPackageVersion` impl ([e63e7b9](https://github.com/brand-dot-dev/java-sdk/commit/e63e7b99e34764bd21c8fbb95b1fa8f1b54f4163))


### Chores

* **internal:** codegen related update ([4b5343e](https://github.com/brand-dot-dev/java-sdk/commit/4b5343efe7d87afec1f527b0dc1583efa310bc74))

## 0.1.0-alpha.14 (2025-09-14)

Full Changelog: [v0.1.0-alpha.13...v0.1.0-alpha.14](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.13...v0.1.0-alpha.14)

### Features

* **api:** api update ([b2748be](https://github.com/brand-dot-dev/java-sdk/commit/b2748beff8255ec66dfebc0793b41ccb38ce1edd))


### Chores

* improve formatter performance ([5621ebe](https://github.com/brand-dot-dev/java-sdk/commit/5621ebefdfe735914554026b4b961834b9108412))
* **internal:** codegen related update ([2da8990](https://github.com/brand-dot-dev/java-sdk/commit/2da8990a3ada4d3c074e23ac866c67c35213fd3a))
* **internal:** codegen related update ([522ad3c](https://github.com/brand-dot-dev/java-sdk/commit/522ad3cc666c00b2a051a2719aa870a7d76c5de3))

## 0.1.0-alpha.13 (2025-09-07)

Full Changelog: [v0.1.0-alpha.12...v0.1.0-alpha.13](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.12...v0.1.0-alpha.13)

### Features

* **api:** manual updates ([a7b282a](https://github.com/brand-dot-dev/java-sdk/commit/a7b282a8abab07b007374d8ef307acd3eae8f1b4))

## 0.1.0-alpha.12 (2025-09-07)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### Features

* **api:** api update ([337bcf9](https://github.com/brand-dot-dev/java-sdk/commit/337bcf91f11d0a5674ab539ea3a939d6335261b7))


### Bug Fixes

* **ci:** use java-version 21 for publish step ([7bf193c](https://github.com/brand-dot-dev/java-sdk/commit/7bf193c2e99b51719dd481c946cec202651a82ec))

## 0.1.0-alpha.11 (2025-08-22)

Full Changelog: [v0.1.0-alpha.10...v0.1.0-alpha.11](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.10...v0.1.0-alpha.11)

### Chores

* **ci:** reduce log noise ([eb9227f](https://github.com/brand-dot-dev/java-sdk/commit/eb9227ff7ecdae92f43c1a8d34d007a477a21f99))
* **client:** refactor closing / shutdown ([3f74b69](https://github.com/brand-dot-dev/java-sdk/commit/3f74b69cb06384847f666e20e9e6ef62da9fad3d))
* **internal:** support running formatters directly ([f40c6fd](https://github.com/brand-dot-dev/java-sdk/commit/f40c6fd07c9e9b4cb1b94e9dbaa379d7b1d96195))

## 0.1.0-alpha.10 (2025-08-19)

Full Changelog: [v0.1.0-alpha.9...v0.1.0-alpha.10](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.9...v0.1.0-alpha.10)

### Features

* **api:** api update ([178da8c](https://github.com/brand-dot-dev/java-sdk/commit/178da8c1095f9c317c076c0fcc299c6b67cd5ffa))
* **api:** api update ([67a51e4](https://github.com/brand-dot-dev/java-sdk/commit/67a51e40c4da7df360151521a8bf38d6a4aff71b))
* **api:** api update ([38711b9](https://github.com/brand-dot-dev/java-sdk/commit/38711b9042f703688cae3cd64f902b0aae116541))


### Performance Improvements

* **internal:** make formatting faster ([c809713](https://github.com/brand-dot-dev/java-sdk/commit/c809713cd4ee18777edcc5c4ba9f3c4bc497d5b0))


### Chores

* **ci:** add build job ([06a3b71](https://github.com/brand-dot-dev/java-sdk/commit/06a3b711bfe8f3750af08c2316e3d58951c16385))
* **internal:** codegen related update ([b84c1a6](https://github.com/brand-dot-dev/java-sdk/commit/b84c1a6567c0f114b45507db69d83e122f89417a))
* **internal:** codegen related update ([be163b3](https://github.com/brand-dot-dev/java-sdk/commit/be163b321dbcbb223190b9f5cf4f062335d520db))
* **internal:** dynamically determine included projects ([fb2dea4](https://github.com/brand-dot-dev/java-sdk/commit/fb2dea46c97c78d26125bd1a7bc71cb924dc73b5))
* **internal:** support passing arguments to test script ([caae50a](https://github.com/brand-dot-dev/java-sdk/commit/caae50a11e9ac79b777f1caa7a61be52583c88c4))
* **internal:** update comment in script ([8abb088](https://github.com/brand-dot-dev/java-sdk/commit/8abb088f123e803bfd509f0246d6bda41e163d30))
* update @stainless-api/prism-cli to v5.15.0 ([9679ada](https://github.com/brand-dot-dev/java-sdk/commit/9679adabac1aef706bc50c9485a45a99f4eeb924))

## 0.1.0-alpha.9 (2025-08-08)

Full Changelog: [v0.1.0-alpha.8...v0.1.0-alpha.9](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.8...v0.1.0-alpha.9)

### Bug Fixes

* **client:** r8 support ([ff8057b](https://github.com/brand-dot-dev/java-sdk/commit/ff8057b4355022c580478cd4f185ca407c70cfad))


### Chores

* **example:** fix run example comment ([85af0f8](https://github.com/brand-dot-dev/java-sdk/commit/85af0f84d86739f9dc477078df30c6f574fc5c41))
* increase max gradle JVM heap to 8GB ([8b2f341](https://github.com/brand-dot-dev/java-sdk/commit/8b2f3419961aa90dc92cc9c4f51bae9413613434))
* **internal:** add async lock helper ([a01460d](https://github.com/brand-dot-dev/java-sdk/commit/a01460d187cb30ba74603da061b98f769ad1e385))
* **internal:** bump ci test timeout ([27f86a9](https://github.com/brand-dot-dev/java-sdk/commit/27f86a9501ea5d2d3064c7cf3e9452c0a82701eb))
* **internal:** reduce proguard ci logging ([fd9496e](https://github.com/brand-dot-dev/java-sdk/commit/fd9496e8f38dd306d9afe5d46505b9122ffa81d5))

## 0.1.0-alpha.8 (2025-07-23)

Full Changelog: [v0.1.0-alpha.7...v0.1.0-alpha.8](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.7...v0.1.0-alpha.8)

### Features

* **api:** manual updates ([7b4fc3a](https://github.com/brand-dot-dev/java-sdk/commit/7b4fc3a69f6df006100550d34340c0451b508cdd))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([e97cbca](https://github.com/brand-dot-dev/java-sdk/commit/e97cbca1c60c8d7ed94838f5553787da727c37dc))
* **client:** allow configuring env via system properties ([6dd2e71](https://github.com/brand-dot-dev/java-sdk/commit/6dd2e71fb4af9920c474b284ba66814f1f74f09b))


### Bug Fixes

* **internal:** set maven publish url ([65c2d32](https://github.com/brand-dot-dev/java-sdk/commit/65c2d329bc9990f1aa73827720cd5e9ea626b5c3))

## 0.1.0-alpha.7 (2025-07-21)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** manual updates ([9c7c076](https://github.com/brand-dot-dev/java-sdk/commit/9c7c07621ea16a0b0adeaa57a96d826d9fa6c045))
* **client:** add https config options ([508033b](https://github.com/brand-dot-dev/java-sdk/commit/508033b672147e010fc171a69fa6d7509acf519c))


### Bug Fixes

* **client:** don't close client on `withOptions` usage when original is gc'd ([e245a89](https://github.com/brand-dot-dev/java-sdk/commit/e245a8943102c4fb296c1a6f99171bd827374daa))
* **client:** ensure error handling always occurs ([be0d357](https://github.com/brand-dot-dev/java-sdk/commit/be0d35783fd23f1d9cffb4ff60857d6e2100769f))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([ce1d549](https://github.com/brand-dot-dev/java-sdk/commit/ce1d54940f67278ab37e9a1c95596df5ba9dcc75))
* **internal:** allow running specific example from cli ([39f74d7](https://github.com/brand-dot-dev/java-sdk/commit/39f74d71d29a9a7cacca25ef0dd472f8c04397ba))
* **internal:** refactor delegating from client to options ([6682663](https://github.com/brand-dot-dev/java-sdk/commit/66826635fed7d2d03e7d2deaff75b91fe0a7c034))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([25962fa](https://github.com/brand-dot-dev/java-sdk/commit/25962facfb9d0e4f9c672d522f12550b7b2cd206))

## 0.1.0-alpha.6 (2025-06-29)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* **api:** manual updates ([de03eb6](https://github.com/brand-dot-dev/java-sdk/commit/de03eb6b3dd9142a05876e6e41ed82bcdb291fa7))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([154c6d8](https://github.com/brand-dot-dev/java-sdk/commit/154c6d888396e0ecf60427616c6d8e0f5780c23e))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([c28b4f2](https://github.com/brand-dot-dev/java-sdk/commit/c28b4f2d66f7218e84167a1bbe1fa9fe453e5b25))


### Chores

* **ci:** only run for pushes and fork pull requests ([5d874d7](https://github.com/brand-dot-dev/java-sdk/commit/5d874d78212fa1d5b489cffad18401397c1f6261))

## 0.1.0-alpha.5 (2025-06-19)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **api:** manual updates ([7a7bfd5](https://github.com/brand-dot-dev/java-sdk/commit/7a7bfd5848404db17a33db7cb695160686a4b70f))

## 0.1.0-alpha.4 (2025-06-19)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **api:** manual updates ([5d445e8](https://github.com/brand-dot-dev/java-sdk/commit/5d445e85b7a5c05acbdcebaf4f3e2e7ed5c9f909))
* **api:** manual updates ([8b819ae](https://github.com/brand-dot-dev/java-sdk/commit/8b819ae77d457e0d8cd987f3e83c8070e25e2c13))


### Chores

* **ci:** enable for pull requests ([393159f](https://github.com/brand-dot-dev/java-sdk/commit/393159f9bc12a5bb89dd42305ab6601f781a2c29))

## 0.1.0-alpha.3 (2025-06-13)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* **api:** manual updates ([54375eb](https://github.com/brand-dot-dev/java-sdk/commit/54375ebc6a0bb8bcbf42b65a82acadf9bd783336))
* **client:** add a `withOptions` method ([3cfe90c](https://github.com/brand-dot-dev/java-sdk/commit/3cfe90c94543b1c271026eaeed3b4b941a311d81))
* **client:** implement per-endpoint base URL support ([a01b1d5](https://github.com/brand-dot-dev/java-sdk/commit/a01b1d5539251f6fb2d99b6e5d2b0a3d7ab075cb))

## 0.1.0-alpha.2 (2025-06-06)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/brand-dot-dev/java-sdk/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** manual updates ([7ff632e](https://github.com/brand-dot-dev/java-sdk/commit/7ff632e5e398dd2163eb7b426cfa1b8237d95b6c))
* **api:** manual updates ([683b63b](https://github.com/brand-dot-dev/java-sdk/commit/683b63bb4ee1164006ddce974187c4753b4f9f07))
* **api:** manual updates ([9105970](https://github.com/brand-dot-dev/java-sdk/commit/91059707087f12335f2b3d6424855d2e74dd0a25))
* **api:** manual updates ([c52a842](https://github.com/brand-dot-dev/java-sdk/commit/c52a84250c0941bcf4bb06e7316c747604f9d94f))
* **api:** manual updates ([27fb91c](https://github.com/brand-dot-dev/java-sdk/commit/27fb91cd5a1e9edd37ecae99a0181011aebdf5ea))

## 0.1.0-alpha.1 (2025-05-29)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/brand-dot-dev/java-sdk/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** manual updates ([afcf5f3](https://github.com/brand-dot-dev/java-sdk/commit/afcf5f3eab36a8a47f145ad5ae9a9d0cc1c937fe))


### Bug Fixes

* **client:** remove `@MustBeClosed` for future returning methods ([a484885](https://github.com/brand-dot-dev/java-sdk/commit/a48488575e6565bc755e5fc0501cee78734b944f))


### Chores

* configure new SDK language ([f60f36e](https://github.com/brand-dot-dev/java-sdk/commit/f60f36e5aa9b4cd2a28d3ddb7433e1cb963a759a))
* update SDK settings ([98a8ca6](https://github.com/brand-dot-dev/java-sdk/commit/98a8ca6965242ad9057d62df2f597d05f04e286c))
