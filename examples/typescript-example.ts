/**
 * TypeScript Example: Box Drawing with JSON Dataset
 *
 * Use Case:
 * - Demonstrates how TypeScript can enforce strong typing.
 * - Useful for web projects, CLI tools, or teaching type safety.
 * - Shows students how to define interfaces and work with JSON.
 */

import * as fs from 'fs';

interface CharEntry {
  symbol: string;
  unicode: string;
}

const chars: CharEntry[] = JSON.parse(fs.readFileSync('../datasets/box-drawing-common.json', 'utf8'));

function getSymbol(code: string): string {
  return chars.find(c => c.unicode === code)!.symbol;
}

const horiz = getSymbol("U+2500");
const vert  = getSymbol("U+2502");
const tl    = getSymbol("U+250C");
const tr    = getSymbol("U+2510");
const bl    = getSymbol("U+2514");
const br    = getSymbol("U+2518");

function boxText(text: string): string {
  const width = text.length;
  return `${tl}${horiz.repeat(width)}${tr}\n` +
         `${vert}${text}${vert}\n` +
         `${bl}${horiz.repeat(width)}${br}`;
}

console.log(boxText("Hello World"));