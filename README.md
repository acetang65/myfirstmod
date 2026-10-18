# MyFirstMod（我的第一个模组）

一个基于 **Fabric** 的《我的世界》**26.2** 模组，用于学习模组开发。作者：Zining Tang

## 功能

### 物品



| 物品    | ID                           | 说明          |
| ----- | ---------------------------- | ----------- |
| 测试物品  | `myfirstmod:test_item`       | 基础物品        |
| 测试物品锭 | `myfirstmod:test_item_ingot` | 由 9 个测试物品合成 |

### 方块



| 方块     | ID                         | 说明                                     |
| ------ | -------------------------- | -------------------------------------- |
| 测试方块   | `myfirstmod:test_block`    | 基础方块（硬度 3.0）                           |
| 测试物品矿石 | `myfirstmod:test_item_ore` | 需铁镐挖掘；掉落 7\~10 个测试物品（时运加成），精准采集时掉落矿石本身 |

### 其他



* **自定义创造物品栏**：新增 "测试物品" 标签页，收录全部物品与方块

* **合成配方**：


  * 9× 测试物品 → 1× 测试物品锭

  * 1× 测试物品锭 → 9× 测试物品

  * 9× 测试物品锭 → 1× 测试方块

  * 1× 测试方块 → 9× 测试物品锭

* **方块掉落物**：测试方块、测试物品矿石均配置战利品表

## 环境要求



| 项目            | 版本           |
| ------------- | ------------ |
| Minecraft     | 26.2         |
| Fabric Loader | ≥ 0.19.5     |
| Fabric API    | 0.161.0+26.2 |
| Java          | ≥ 25         |

## 安装



1. 安装 [Fabric Loader](https://fabricmc.net/use/) 与 [Fabric API](https://modrinth.com/mod/fabric-api)

2. 从 Releases 下载本模组的 jar 文件

3. 将 jar 放入 `.minecraft/mods/` 文件夹

4. 启动游戏

## License

本项目基于 CC0 许可证发布（见 [LICENSE](LICENSE)）。